package q_2;

public class binary {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,5,5,6};
        int key = 6;

        int count = 0;
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int index = -1;

        while (left <= right) {
            mid = (left + right) / 2;
            count++;

            if (key == arr[mid]) {
                index = mid;
                break;
            }

            count++;
            if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not Found!");
        }

        System.out.println("Total Comparisons: " + count);
    }
}