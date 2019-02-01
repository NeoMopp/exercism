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
    //Break the sentence into an array
    words : Array[String] = statement.split(" ")
    //Check to see if any of the words have been shouted and return
    var result = false
    for (word <- words){
      if (word.toUpperCase() == word && word.charAt(0) == world.charAt(0).toLowerCase){
        result = true
    }
  }
  result
}
