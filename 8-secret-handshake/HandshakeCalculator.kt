object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val signals = mutableListOf<Signal>()
        if (number and 1 == 1) signals.add(Signal.WINK)
        if (number and 2 == 2) signals.add(Signal.DOUBLE_BLINK)
        if (number and 4 == 4) signals.add(Signal.CLOSE_YOUR_EYES)
        if (number and 8 == 8) signals.add(Signal.JUMP)
        if (number and 16 == 16) signals.reverse()
        return signals
    }
}
