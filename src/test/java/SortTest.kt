import com.google.common.truth.Truth.assertThat
import org.junit.Test

class SortTest {

    private val unsorted = intArrayOf(3, 4, 18, 2, 7, 1)
    private val sorted = intArrayOf(1, 2, 3, 4, 7, 18)

    @Test
    fun mergeSort() {
        val array = unsorted.copyOf()

        mergeSort(array)

        assertThat(array).isEqualTo(sorted)
    }
}
