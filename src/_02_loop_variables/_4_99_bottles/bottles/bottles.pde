int bottleNum = 99;
for (int i = 0; i < 100; i++){
  int bottleNumNext = bottleNum - 1;
  if(bottleNum == 1){
    print("\n" + bottleNum + " bottle of beer on the wall," + bottleNum + " bottle of beer.\nTake one down and pass it around, no more bottles of beer on the wall.");
  } else if (bottleNum == 0){
   print("\nNo more bottles of beer on the wall, no more bottles of beer. \nGo to the store and buy some more, 99 bottles of beer on the wall.");
   System.exit(0);
  } else {
   print("\n" + bottleNum + " bottles of beer on the wall, " + bottleNum + " bottles of beer. \nTake one down and pass it around, " + bottleNumNext + " bottles of beer on the wall."); 
  }
  bottleNum = bottleNumNext;
}
