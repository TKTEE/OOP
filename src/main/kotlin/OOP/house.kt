package OOP

class House(owner:String, location:String, price:Int, door:Int,) {
    //initialize our class
    init {
        println("Owner of the house is $owner")
        println("house is located in $location")
        println("price is $price")
        println("It has $door number of doors")
    }
}

fun main(args: Array<String>) {
    var owner_one = House("Mike","Kahawa sukari",10000,2)
    println("........End of house1.......")
    var owner_two = House("Tony","Muthiga",15000,2)
    println("........End of house2.....")
    var owner_three = House("Eunice","Westlands",30000,2)
    println("........End of house3.....")
}