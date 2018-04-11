class BinarySearch : AlgorithmContract {
    private fun implemented(list: Array<Int>, item: Int): Int? {
        var low = 0
        var high = list.size - 1

        while (low <= high) {
            val mid = (low + high) / 2
            val guess = list[mid]

            if (guess == item) return mid

            if (guess > item) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }

        return null
    }

    override fun execute() {
        val source = arrayOf(1, 3, 5, 7, 8)
        println("탐색 결과: ${implemented(source, 3)}")
        println("탐색 결과: ${implemented(source, -1)}")
    }
}