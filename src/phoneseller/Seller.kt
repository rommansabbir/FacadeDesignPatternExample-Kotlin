package phoneseller

/**
 * This class contain all phones information
 */
class Seller {
    private val nokiaPhone = NokiaPhone()
    private val samsungPhone = SamsungPhone()
    private val iPhone = Iphone()

    /**
     * Get info about Nokia phone
     */
    fun getNokiaInfo(){
        nokiaPhone.modelNo()
        nokiaPhone.price()
    }

    /**
     * Get info about Samsung phone
     */
    fun getSamsungInfo(){
        samsungPhone.modelNo()
        samsungPhone.price()
    }

    /**
     * Get info about Iphone
     */
    fun getIphoneInfo(){
        iPhone.modelNo()
        iPhone.price()
    }
}