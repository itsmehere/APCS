public boolean between(double a, double low, double high) {
  return (a >= low) && (a <= high);
}

// returns true if the card at position (col, row) is in the locs Arraylist. False otherwise.
public boolean cardInSelected(int col, int row, ArrayList<Location> locs){
  for(int i = 0; i < locs.size(); i++){
    if((col == locs.get(i).getCol()) && (row == locs.get(i).getRow())){
      return true;
    }
  }
  return false;
}
