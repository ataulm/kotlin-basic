import com.google.common.truth.Truth.assertThat
import org.junit.Test

class SortTest {

    private val unsorted = intArrayOf(3, 4, 18, 16, 15, 2, 7, 12, 1)
    private val sorted = intArrayOf(1, 2, 3, 4, 7, 12, 15, 16, 18)

    @Test
    fun mergeSort() {
        val array = unsorted.copyOf()

        mergeSort(array)

        assertThat(array).isEqualTo(sorted)
    }

    @Test
    fun quickSort() {
        val array = unsorted.copyOf()

        quickSort(array)

        assertThat(array).isEqualTo(sorted)
    }
}
