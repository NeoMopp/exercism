object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
        //Set up the return and the set we are going to use to track things
        var result  : Int = 0
        var tempSet : Set[Int] = Set()

        //Not sure how to return early, 

        //Iterate the range and calculate the total
        for (it <- 1 until limit){
        for (jt <- factors){
            if (((it % jt) == 0) && !tempSet.contains(it)){
                result = result + it
                tempSet += it
                //Apparently no break in scala so this loop is N^2
        }
    }
}
    result
  }
}
