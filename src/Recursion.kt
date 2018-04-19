class Recursion : AlgorithmContract {
    /**
     * 재귀 함수는 함수가 자기자신을 부르기 때문에, 무한 루프에 빠지기 쉽다.
     *
     * 재귀 함수를 만들때는 언제 재귀를 멈출 지 알려줘야 된다.
     * 그러므로, 모든 재귀 함수에는 "기본 단계"와 "재귀 단계"라는 두부분이 존재한다.
     */
    private fun countDown(i: Int) {
        print("$i...")

        Thread.sleep(1000)
        if (i <= 1) {
            // 기본 단계
            return
        } else {
            // 재귀 단계
            countDown(i - 1)
        }
    }

    private fun fact(x: Int): Int = if (x == 1) 1 else x * fact(x - 1)

    override fun execute() {
        countDown(5)
        println()
        println("fact: ${fact(3)}")
    }
}