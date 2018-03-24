/**
 * Works by splitting an array into two halves, sorting each half and then merging the result together.
 */
fun mergeSort(array: IntArray) {
    mergeSort(array, 0, array.size - 1)
}

private fun mergeSort(array: IntArray, low: Int, high: Int) {
    if (low >= high) { // here we know we've finished
        return
    }
    val middle = (low + high) / 2
    mergeSort(array, low, middle)
    mergeSort(array, middle + 1, high)
    mergeHalves(array, low, middle, high)
}

private fun mergeHalves(array: IntArray, low: Int, middle: Int, high: Int) {
    val helper = IntArray(array.size)
    for (i in low..high) { // copy the portion of the array we're merging right now
        helper[i] = array[i]
    }

    var helperLeft = low
    var helperRight = middle + 1
    var current = low

    while (helperLeft <= middle && helperRight <= high) {
        if (helper[helperLeft] < helper[helperRight]) {
            array[current] = helper[helperLeft]
            helperLeft++
        } else {
            array[current] = helper[helperRight]
            helperRight++
        }
        current++
    }

    val remaining = middle - helperLeft
    for (i in 0..remaining) {
        array[current + i] = helper[helperLeft + i]
    }
}
