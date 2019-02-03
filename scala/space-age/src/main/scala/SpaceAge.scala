object SpaceAge {
  var yearOnEarthInSeconds = 31557600
  var yearOnMercuryInSeconds = 0.2408467
  var yearOnVenusInSeconds = 0.61519726
  var yearOnMarsInSeconds = 1.8808158
  var yearOnJupiterInSeconds = 11.862615
  var yearOnSaturnInSeconds = 29.447498
  var yearOnUranusInSeconds = 84.016846
  var yearOnNeptuneInSeconds = 164.79132

  def onEarth(timeInSeconds: Double): Double = timeInSeconds / yearOnEarthInSeconds

  def onMercury(timeInSeconds: Double): Double = onEarth(timeInSeconds) / yearOnMercuryInSeconds

  def onVenus(timeInSeconds: Double): Double = onEarth(timeInSeconds) / yearOnVenusInSeconds

  def onMars(timeInSeconds: Double): Double = onEarth(timeInSeconds) / yearOnMarsInSeconds

  def onJupiter(timeInSeconds: Double): Double = onEarth(timeInSeconds) / yearOnJupiterInSeconds

  def onSaturn(timeInSeconds: Double): Double = onEarth(timeInSeconds) / yearOnSaturnInSeconds

  def onUranus(timeInSeconds: Double): Double = onEarth(timeInSeconds) / yearOnUranusInSeconds

  def onNeptune(timeInSeconds: Double): Double = onEarth(timeInSeconds) / yearOnNeptuneInSeconds
}
