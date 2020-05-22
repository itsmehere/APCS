public class Grid {
  // In the physical SET game, cards are placed on the table.
  // The table contains the grid of cards and is typically called the board.
  //
  // Note that the minimum number of cards that guarantees a set is 21,
  // so we create an array with enough columns to accommodate that.
  // (MAX_COLS == 7)
  Card[][] board = new Card[MAX_COLS][ROWS];   
  
  ArrayList<Location> selectedLocs = new ArrayList<Location>();  // Locations selected by the player
  ArrayList<Card> selectedCards = new ArrayList<Card>();         // Cards selected by the player 
                                                                 // (corresponds to the locations)  
  int cardsInPlay;    // Number of cards visible on the board

  public Grid() { 
    cardsInPlay = 0;
  }


  // GRID MUTATION PROCEDURES
  
  // 1. Highlight (or remove highlight) selected card
  // 2. Add (or remove) the location of the card in selectedLocs
  // 3. Add the card to (or remove from) the list of selectedCards
  public void updateSelected(int col, int row) {
    Card card = board[col][row];

    if (selectedCards.contains(card)) {
      int index = selectedCards.indexOf(card);
      selectedLocs.remove(index);
      selectedCards.remove(card);
      //score--;
    } else {
      selectedLocs.add(new Location(col, row));
      selectedCards.add(card);
    }

    //System.out.println("Cards = " + selectedCards + ", Locations = " + selectedLocs);
  }

  // Precondition: A Set has been successfully found
  // Postconditions: 
  //    * The number of columns is adjusted as needed to reflect removal of the set
  //    * The number of cards in play is adjusted as needed
  //    * The board is mutated to reflect removal of the set
  public void removeSet() {
    // Because it seems to make for a better UX, cards should not change locations unless
    // the number of columns has decreased.  If that happens, cards from the rightmost
    // column should be moved to locations where cards that formed the selected set
    // Put the locations of the selected cells in order.  Cards from the rightmost column
    // that are part of the set should be removed instead of being migrated.
    
    selectedLocs.sort(null);  // Don't delete this line as it orders the selected locations
                              // You may wish to look up how the Location class decides
                              // how to compare two different locations.  Also look up the
                              // documentation on ArrayList to see how sort(null) works
                              
    if(cardsInPlay > 12 || deck.size() == 0){
      /*
       * colToRemove tells us how far away the last column is.
       * For example, in a board with 15 cards, the call to col(15-12) would return 1 telling us 
       * that the third column(0 based) + 1 column is the one we have to consolidate.
       *
       * locationToReplace is useful when having a card which is in a set AND in the column that has to be removed.
       * We only update locationToReplace when we have found a card in the column that is worth consolidating(isn't it the chosen set).
       */
      int colToRemove = col(cardsInPlay - 12);
      int locationToReplace = 0;
      
      // Loop through the cards in the consolidating column.
      for(int i = 0; i < 3; i++){
        
        // Get the location of the first selected card in the set so we can replace it.
        int selectedCol = selectedLocs.get(locationToReplace).getCol();
        int selectedRow = selectedLocs.get(locationToReplace).getRow();
        
        // If the card in the column is not in selectedLocs, we want to move it to a selectedLocs position.
        // Then, increment locationToReplace to move on to the next selectedLoc.
        if(!cardInSelected(3 + colToRemove, i, selectedLocs)){
          board[selectedCol][selectedRow] = board[3 + colToRemove][i];
          board[3 + colToRemove][i] = null;
          locationToReplace++;
        }
      }
      
      // Finally, decrease cardsInPlay by 3 and update currentCols to show the column has been consolidated.
      cardsInPlay -= 3;
      currentCols--;
      
      // If the cardsInPlay == 12, then replace the selected cards with new Cards from deck.deal();
    } else if (cardsInPlay == 12 && deck.size() != 0){
      for(int i = 0; i < 3; i++){
        Card a = deck.deal();
        int Col = selectedLocs.get(i).getCol();
        int Row = selectedLocs.get(i).getRow();
        board[Col][Row] = a;
      }
    }
  }
  
  // Precondition: Three cards have been selected by the player
  // Postcondition: Game state, score, game message mutated, selected cards list cleared
  public void processTriple() {
    if (isSet(selectedCards.get(0), selectedCards.get(1), selectedCards.get(2))) {
      score += 10;
      removeSet();
      if (isGameOver()) {
        state = State.GAME_OVER;
        runningTimerEnd = millis();
        score += timerScore();
        message = 7;
      } else {
        state = State.PLAYING;
        message = 1;
      }
    } else {
      score -= 5;
      state = State.PLAYING;
      message = 2;
    }
    clearSelected();
  }
  
  
  // DISPLAY CODE
  
  public void display() {
    int cols = cardsInPlay / 3;
    for (int col = 0; col < cols; col++) {
      for (int row = 0; row < ROWS; row++) {
        board[col][row].display(col, row);
      }
    }
  }

  public void highlightSelectedCards() {
    color highlight;
    if (state == State.FIND_SET) {
      highlight = FOUND_HIGHLIGHT;
      selectedLocs = findSet();
      if (selectedLocs.size() == 0) {
        message = 6;
        return;
      }
    } else if (selectedLocs.size() < 3) {
      highlight = SELECTED_HIGHLIGHT;
    } else {
      highlight = isSet(selectedCards.get(0), selectedCards.get(1), selectedCards.get(2)) ?
                  CORRECT_HIGHLIGHT :
                  INCORRECT_HIGHLIGHT;
    }
    for (Location loc : selectedLocs) {
      drawHighlight(loc, highlight);
    }
  }
  
  public void drawHighlight(Location loc, color highlightColor) {
    stroke(highlightColor);
    strokeWeight(5);
    noFill();
    int col = loc.getCol();
    int row = loc.getRow();
    rect(GRID_LEFT_OFFSET+col*(CARD_WIDTH+GRID_X_SPACER), 
      GRID_TOP_OFFSET+row*(CARD_HEIGHT+GRID_Y_SPACER), 
      CARD_WIDTH, 
      CARD_HEIGHT);
    stroke(#000000);
    strokeWeight(1);
  }

  
  // DEALING CARDS

  // Preconditions: cardsInPlay contains the current number of cards on the board
  //                the array board contains the cards that are on the board
  // Postconditions: board has been updated to include the card
  //                the number of cardsInPlay has been increased by one
  public void addCardToBoard(Card card) {
    int numCards = cardsInPlay;
    
    for(int i = 0; i < MAX_COLS; i++){
      for(int j = 0; j < ROWS; j++){
        if(numCards == 0){
          board[i][j] = card;
          cardsInPlay++;
          return;
        } else {
          numCards--;
        }
      }
    }
  }
    
  public void addColumn() {
    if(deck.size() == 0){
      message = 5;
      return;
    }
    
    if(findSet().isEmpty()){
      score += 5;
      addCardToBoard(deck.deal());
      addCardToBoard(deck.deal());
      addCardToBoard(deck.deal());
      currentCols++;
      
      message = 3;
    } else {
      score -= 5;
      message = 4;
    }
  }

  
  // GAME PROCEDURES
  
  public boolean isGameOver() {
    if(deck.size() < 3 && findSet().isEmpty()){
      return true;
    }
    return false;
  }

  public boolean tripleSelected() {
    return (selectedLocs.size() == 3);
  }
   
  // Preconditions: --
  // Postconditions: The selected locations and cards ArrayLists are empty
  public void clearSelected() {
    selectedLocs.clear();
    selectedCards.clear();
  }
  
  // findSet(): If there is a set on the board, existsSet() returns an ArrayList containing
  // the locations of three cards that form a set, an empty ArrayList (not null) otherwise
  // Preconditions: --
  // Postconditions: No change to any state variables
  public ArrayList<Location> findSet() {
    ArrayList<Location> locs = new ArrayList<Location>();
    for (int i = 0; i < currentCols*3 - 2; i++) {
      for (int j = i+1; j < currentCols*3 - 1; j++) {
        for (int k = j+1; k < currentCols*3; k++) {
          if (isSet(board[col(i)][row(i)], board[col(j)][row(j)], board[col(k)][row(k)])) {
            locs.add(new Location(col(i), row(i)));
            locs.add(new Location(col(j), row(j)));
            locs.add(new Location(col(k), row(k)));
            return locs;
          }
        }
      }
    }
    return new ArrayList<Location>();
  }

  
  // UTILITY FUNCTIONS FOR GRID CLASS
  
  public int col(int n) {
    return n/3;
  }
  
  public int row(int n) {
    return n % 3;
  }
   
  public int rightOffset() {
    return GRID_LEFT_OFFSET + currentCols * (CARD_WIDTH + GRID_X_SPACER);
  }
}
