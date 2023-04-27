package OOP

class Car(owner:String, doors:Int, engine:String, colour:String, numplate:String,type:String,){

    init{
        println("Owner of the car is $owner")
        println("Has $doors number of doors")
        println("Engine of type of car is $engine")
        println("Colour of car is $colour")
        println("Number plate is $numplate")
        println("Type of car is $type")
    }
}

fun main(args: Array<String>) {
    var owner_one = Car("Tony", 4, "V12","Blue","KEG 123G","Dodge Durango Hellcat")
    println("...END of Car 1...")
    var owner_two = Car("Frank", 5, "V8","Black","KED 452Y","Land Rover LC300")
    println("...END of Car 2...")
    var owner_three = Car("Tony", 4, "V6","Silver","KDZ 928B","Jeep Wagoneer")
    println("...END of Car 3...")
}