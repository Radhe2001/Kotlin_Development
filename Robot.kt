class Robot(var time :Double , var day : String){


    val favouriteFood = arrayOf("Shahi Paneer" , "Rajma Chawal","Momos","Gulab Jamun","Butter chicken","Chicken Biryani" , "Masala Dosa","Chana Bhatura","Kheer","Chicken Tandoori")
    
    
    fun alarm(){
        println("Please wake up its ${day} and the time is ${time}")
    }
    
    
    
    fun makeCofee( type : String , sugar:Double){
        println("Here is your ${type} coffee with ${sugar} spoon sugar")
    }


    fun heatTheWater( temperature :Double){
        println("water has been heated and it's temperature is ${temperature}")
    }
    
    
    fun packyYourBag(days : String){
        when(days){
            "monday" -> println("i have put maths and physics in your bag")
            "tuesday" -> println("i have put physics and chemestry in your bag")
            "wednesday" -> println("i have put chemestry and biology in your bag")
            "thursday" -> println("i have put biology and computer in your bag")
            "friday" -> println("i have put computer and maths in your bag")
        }
    }
    
    fun cookBreakfastAndLunch(type : String){
        println("${favouriteFood.random()} is ready for ${type}")
    }


    fun ironTheCloths(cloths : String){
        println("${cloths} are ironed now it's ready wear")
    }
}


fun main(){
    var obj = Robot(6.30 , "Monday")
    
    // to ring the alarm this function should be called
    obj.alarm()
    
    // to make the cofee this function should be called
    obj.makeCofee("Black",1.5)
    
    //to heat the water this function should be called
    obj.heatTheWater(50.5)
    
    // to pack your bags you should call this function
    obj.packyYourBag("tuesday")
    
    // to cook food you need to call this function
    obj.cookBreakfastAndLunch("Dinner")
    
    // to iron the cloths you need to call this function
    obj.ironTheCloths("shirt , pant")
    
    
}