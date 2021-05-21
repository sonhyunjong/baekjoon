1. 선택정렬 O(n^2)/O(n^2) : 오른쪽 리스트에서 가장 작은 숫자를 선택하여 왼쪽 리스트로 이동하는 작업을 되풀이함
  
        selection_sort(A,n):
  
        for i<-0 to n-2 do
                 least<-A[i], A[i+1], ..., A[n-1] 중에서 가장 작은 값의 인덱스;
                  A[i]와 A[least]의 교환;
                  i++;
                  
2. 삽입정렬 O(n)/O(n^2) : 정렬되어 있는 리스트에 새로운 에코드를 적절한 위치에 삽입하는 과정을 반복한다
        
        insert_sort(A,n):
        
        for i<-1 to n-1 do
          key<-A[i];
          j<-i-1;
          while j>=0 and A[j]>key do
            A[j+1]<-A[j];
            j<-j-1;
          A[j+1]<-key;
          
3. 버블정렬O(n^2)/O(n^2) : 인접한 2개의 레코드를 비교하여 크기가 순서대로 되어있지 않으면 서로 교환하는 비교-교환 과정을 리스트의 왼쪽 끝에서 시작하여 오른쪽 끝까지 진행한다.

       BubbleSort(A,n) :
       
       for i<-n-1 to 1 do
        for j<-0 to i-1 do
          j와 j+1번째의 요소가 크기순이 아니면 교환
          j++;
        i--;
        
4. 쉘정렬 O(n)/O(n^1.5) : 먼저 정렬해야할 리스트를 일정한 기준에 따라 분류하여 연속적이지 않은 여러 개의 부분 리스트를 만들고, 각 부분 리스트를 삽입 정렬을 이용하여 정렬한다. (삽입 정렬에 간격두기)
```
      void shell_sort(int list[], int n)
      {
        int i, gap;
        for(gap = n/2; gap>0; gap=gap/2){
          if((gap%2) ==0) gap++;
          for(i=0; i<gap; i++)
            inc_insertion_sort(list, i, n-1, gap);
        }
      }
```    

5. 합병정렬 O(nlog2n)/O(nlog2n): 하나의 리스트를 두개의 균등한 크기로 분할하고 분할된 부분 리스트를 정렬한 다음, 두 개의 정렬된 부분 리스트를 합하여 정체가 정렬된 리스트를 얻고자 하는것이다.

       merge_sort(list, left, right):    
      
       if left<right
          mid = (left+right)/2;
          merge_sort(list, left, mid);
          merge_sort(list, mid+1, right);
          merge(list, left, mid, right);
          
6. 퀵정렬 O(nlog2n)/O(n^2) : 리스트 안에 한요소(피벗)를 정하고 피벗보다 작은 요소들은 모두 피벗의 왼쪽으로 옮겨지고 피벗보다 큰 요소들은 모두 피벗의 오른쪽으로 옮겨진다.
```
      void quick_sort(int list[], int left, int right)
      {
        if(left < right)
          int q = partition(list, left, right);
          quick_sort(list, left, q-1);
          quick_sort(list, q+1, right);
      }
```      
7. 히프정렬, 8. 기수정렬
--------------------------------------------------------------------------------------------------------------------------------------------------------     

제네릭 컬렉션
1. vector<>
2. ArrayList<> : vector<>와 비슷. 다수의 스레드가 동시에 ArrayList에 요소를 삽입하거나 삭제할 때 출동이 발생
3. HashMap<K, V>
4. HashSet<> : 순서 X, 중복 X
5. LinkedList<>

--------------------------------------------------------------------------------------------------------------------------------------------------------


Comparable - 이 인터페이스를 구현한 객체 스스로에게 부여하는 한 가지 기본 정렬 규칙을 설정하는 목적으로 사용한다.
```
public interface Comparable<T> { public int compareTo(T o); }
```


Comparator - 이 인터페이스를 구현한 클래스는 정렬 규칙 그 자체를 의미하며, 기본 정렬 규칙과 다르게 원하는대로 정렬순서를 지정하고 싶을 때 사용한다.
```
@FunctionalInterface public interface Comparator<T> { int compare(T o1, T o2); boolean equals(Object obj); }
```

