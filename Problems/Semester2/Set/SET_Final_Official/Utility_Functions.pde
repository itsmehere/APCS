public boolean between(double a, double low, double high) {
  return (a >= low) && (a <= high);
}

public boolean cardInSelected(int col, int row, ArrayList<Location> locs){
  for(int i = 0; i < locs.size(); i++){
    if((col == locs.get(i).getCol()) && (row == locs.get(i).getRow())){
      return true;
    }
  }
  return false;
}
