package phoneseller

/**
 * [PhonesInfo] interface expose phones basic info to the client who will consume it
 */
interface PhonesInfo {
    /**
     * Expose phone model no
     */
    fun modelNo()

    /**
     * Expose phone price
     */
    fun price()
}