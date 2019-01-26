object Bob {
  def response(statement: String): String = {
    //Basic response
    var result = "Whatever."

    if (statement.contains('?')){
      //Respond to a question
      result = "Sure."
    }
    result = "Calm down, I know what I'm doing!"
    result = "Whoa, chill out!"
    result
  }

  //Function to check if the sentence has any words that are "shouted"
  def isShouting(statement: String): Boolean = {
    
  }
}
