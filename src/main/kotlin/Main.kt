fun main(){
    val Rebecca=Human("Rebecca",15,53)
     Rebecca.foodw(10)
    Rebecca.speak("Today is a good day")
    Rebecca.birthday(1)
    val STUDENT=User("Rebecca","Simiyu","simiyu@gmail.com",
        "0799202122","dr2222.")
    println(STUDENT.firstname)
    println(STUDENT.password)

}
//1. Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//Create an instance of this human class and invoke all its functions
 class Human(var name:String,var age:Int,var weight:Int) {
    //- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
    fun foodw(foodWeight: Int) {
        var Humanweight = foodWeight + weight
        println("I am eating $Humanweight kgs of food")
    }
    //- speak(speech: String) :Prints the string passed to it (2 points)
    fun speak(speech: String) {
        println(speech)
    }
    //- birthday( ) :Increments the human’s age by 1 (2 points)
    fun birthday(addition:Int) {
        var sum = age + addition
        println(sum)
    }
}
//2. Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2 attributes
data class User(var firstname:String,var lastname:String,var email:String,
                var phoneNumber:String,var password:String){

}
