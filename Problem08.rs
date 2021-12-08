fn main() {
    let arr = &mut [2, 3, 5, 21, 1, 2, 3, 1352, 23, 5];
    println!("Before: {:?}", arr);
    let sorted = sort(arr);
    println!("Sorted: {:?}", sorted);
}

fn sort(arr: &mut [i32]) -> &mut [i32] {
    let mut changed = false;
    for i in 0..arr.len() {
        for j in 0..arr.len() - 1 - i {
            if arr[j] > arr[j + 1] {
                let swap = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = swap;
                changed = true
            }
        }

        if !changed {
            return arr;
        }
    }

    return arr;
}
