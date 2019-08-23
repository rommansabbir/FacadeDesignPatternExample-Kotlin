package phoneseller

/**
 * Nokia Phone implements [PhonesInfo] as all phones has model no & price specifically
 */
class NokiaPhone : PhonesInfo {
    override fun modelNo() {
        println("Nokia 6")
    }

    override fun price() {
        println("18000 TK")
    }
}