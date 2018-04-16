class SelectionSort : AlgorithmContract {
    private fun findSmallest(arr: List<Int>): Int {
        var smallest = arr[0]
        var smallestIndex = 0

        // TODO: arr.withIndex()를 써도 되지 않을라나...?
        for (i in arr.indices) if (arr[i] < smallest) {
            smallest = arr[i]
            smallestIndex = i
        }

        return smallestIndex
    }

    private fun selectionSort(arr: MutableList<Int>): List<Int> {
        val size = arr.size
        val newArr = ArrayList<Int>(size)

        for (i in 0 until size) {
            val smallest = findSmallest(arr)
            newArr.add(arr[smallest])

            arr.removeAt(smallest)
        }

        return newArr
    }

    override fun execute() {
        val source = arrayListOf<Int>(5, 3, 6, 2, 10)
        println("정렬 결과: ${selectionSort(source)}")
    }
}