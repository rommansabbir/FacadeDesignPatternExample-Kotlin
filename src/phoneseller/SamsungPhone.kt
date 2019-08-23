package phoneseller

/**
 * Nokia Phone implements [SamsungPhone] as all phones has model no & price specifically
 */
class SamsungPhone : PhonesInfo {
    override fun modelNo() {
        println("Samsung S10")
    }

    override fun price() {
        println("10000 TK")
    }
}