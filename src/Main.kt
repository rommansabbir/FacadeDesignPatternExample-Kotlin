import phoneseller.Seller

class Main {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val seller = Seller()
            seller.getIphoneInfo()
            seller.getNokiaInfo()
            seller.getSamsungInfo()
        }
    }


}