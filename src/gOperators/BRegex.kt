
val regex = """\b(?<city>[A-Za-z\s]+),\s(?<state>[A-Z]{2}):\s(?<areaCode>[0-9]{3})\b""".toRegex()

val match = regex.find(input)!!
println(match.groups["city"]?.value)
    
// Austin
println(match.groups["state"]?.value)

// TX
println(match.groups["areaCode"]?.value)