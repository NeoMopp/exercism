class School {
  type DB = Map[Int, Seq[String]]

  var school : DB = Map()

  def add(name: String, g: Int) = {
    school += g
  }

  def db: DB = school

  def grade(g: Int): Seq[String] = school.getOrElse(g, Seq())

  def sorted: DB = school
}
