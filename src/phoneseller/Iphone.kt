package phoneseller

/**
 * Nokia Phone implements [Iphone] as all phones has model no & price specifically
 */
class Iphone : PhonesInfo {
    override fun modelNo() {
        println("iPhone 7s")
    }

    override fun price() {
        println("78000 TK")
    }
}