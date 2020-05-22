boolean sameColor(Card a, Card b, Card c) {
  // 0 -> Green.
  // 1 -> Purple.
  // 2 -> Red.
  int aCol = ((a.getCol() <= 2) ? 0 : ((a.getCol() >= 3 && a.getCol() <= 5) ? 1 : 2));
  int bCol = ((b.getCol() <= 2) ? 0 : ((b.getCol() >= 3 && b.getCol() <= 5) ? 1 : 2));
  int cCol = ((c.getCol() <= 2) ? 0 : ((c.getCol() >= 3 && c.getCol() <= 5) ? 1 : 2));
  
  if(allEqual(aCol, bCol, cCol)){
    return true;
  } else {
    return false;
  }
}

boolean sameShape(Card a, Card b, Card c) {
  int aColRemainder = a.getCol() % 3;
  int bColRemainder = b.getCol() % 3;
  int cColRemainder = c.getCol() % 3;
  
  if(allEqual(aColRemainder, bColRemainder, cColRemainder)){
    return true;
  } else {
    return false;
  }
}

boolean sameFill(Card a, Card b, Card c) {
  // 0 -> Filled.
  // 1 -> Dashed.
  // 2 -> Empty.
  int aRow = ((a.getRow() <= 2) ? 0 : ((a.getRow() >= 3 && a.getRow() <= 5) ? 1 : 2));
  int bRow = ((b.getRow() <= 2) ? 0 : ((b.getRow() >= 3 && b.getRow() <= 5) ? 1 : 2));
  int cRow = ((c.getRow() <= 2) ? 0 : ((c.getRow() >= 3 && c.getRow() <= 5) ? 1 : 2));
  
  if(allEqual(aRow, bRow, cRow)){
    return true;
  } else {
    return false;
  }
}

boolean sameCount(Card a, Card b, Card c) {
  int aRowRemainder = a.getRow() % 3;
  int bRowRemainder = b.getRow() % 3;
  int cRowRemainder = c.getRow() % 3;
  
  if(allEqual(aRowRemainder, bRowRemainder, cRowRemainder)){
    return true;
  } else {
    return false;
  }
}

boolean diffColor(Card a, Card b, Card c) {
  // 0 -> Green.
  // 1 -> Purple.
  // 2 -> Red.
  int aCol = ((a.getCol() <= 2) ? 0 : ((a.getCol() >= 3 && a.getCol() <= 5) ? 1 : 2));
  int bCol = ((b.getCol() <= 2) ? 0 : ((b.getCol() >= 3 && b.getCol() <= 5) ? 1 : 2));
  int cCol = ((c.getCol() <= 2) ? 0 : ((c.getCol() >= 3 && c.getCol() <= 5) ? 1 : 2));
  
  if(allDifferent(aCol, bCol, cCol)){
    return true;
  } else {
    return false;
  }
}

boolean diffShape(Card a, Card b, Card c) {
  int aColRemainder = a.getCol() % 3;
  int bColRemainder = b.getCol() % 3;
  int cColRemainder = c.getCol() % 3;
  
  if(allDifferent(aColRemainder, bColRemainder, cColRemainder)){
    return true;
  } else {
    return false;
  }
}

boolean diffFill(Card a, Card b, Card c) {
  // 0 -> Filled.
  // 1 -> Dashed.
  // 2 -> Empty.
  int aRow = ((a.getRow() <= 2) ? 0 : ((a.getRow() >= 3 && a.getRow() <= 5) ? 1 : 2));
  int bRow = ((b.getRow() <= 2) ? 0 : ((b.getRow() >= 3 && b.getRow() <= 5) ? 1 : 2));
  int cRow = ((c.getRow() <= 2) ? 0 : ((c.getRow() >= 3 && c.getRow() <= 5) ? 1 : 2));
  
  if(allDifferent(aRow, bRow, cRow)){
    return true;
  } else {
    return false;
  }
}

boolean diffCount(Card a, Card b, Card c) {
  int aRowRemainder = a.getRow() % 3;
  int bRowRemainder = b.getRow() % 3;
  int cRowRemainder = c.getRow() % 3;
  
  if(allDifferent(aRowRemainder, bRowRemainder, cRowRemainder)){
    return true;
  } else {
    return false;
  }
}  

boolean isSet(Card a, Card b, Card c) {
  return (((sameCount(a, b, c) || diffCount(a, b, c)) && 
           (sameShape(a, b, c) || diffShape(a, b, c)) && 
           (sameFill(a, b, c) || diffFill(a, b, c)) && 
           (sameColor(a, b, c) || diffColor(a, b, c))) ? true : false);
}


boolean allEqual(int a, int b, int c){
  if(a == b && b == c){
    return true;
  } else {
    return false;
  }
}

boolean allDifferent(int a, int b, int c){
  if(a != b && b != c && a != c){
    return true;
  } else {
    return false;
  }
}
