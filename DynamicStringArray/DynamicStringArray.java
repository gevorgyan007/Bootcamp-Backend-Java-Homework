package com.company.DynamicStringArray;

public class DynamicStringArray {
    private String[] stringArray = new String[8];
    private int count;

    public DynamicStringArray() {
        count = 0;
    }

    public void add(String item) {
        if (!item.equals(null)) {
            if (count < stringArray.length) {
                stringArray[count] = item;
                count++;
            } else {
                String[] newArray = new String[stringArray.length + 1];
                for (int i = 0; i < stringArray.length; i++) {
                    newArray[i] = stringArray[i];
                }
                newArray[newArray.length - 1] = item;
                stringArray = newArray;
                count++;
            }
        }
    }

    public void remove(int index) {
        if ((index >= 0) && (index < stringArray.length)) {
            String[] newArray = new String[stringArray.length - 1];
            for (int j = 0; j < index; j++) {
                newArray[j]=stringArray[j];
            }
            for (int i = index; i < count-1 ; i++)
                newArray[i] = stringArray[i + 1];
            stringArray = newArray;
            count--;
        }
    }

    public void remove(String item) {
        remove(indexOf(item));
    }

    public int size() {
        return count;
    }

    public int indexOf(String item) {
        for (int i = 0; i < count-1; i++) {
            if (stringArray[i].equals(item)) {
                return i;}
        }
        return -1;
    }

    public int lastIndexOf(String item) {
        for (int i = count - 1; i >= 0; i--) {
            if (stringArray[i].equals(item))
                return i;
        }
        return -1;
    }

    public String[] sort(sortType type) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if ((stringArray[j].compareTo(stringArray[j + 1]) > 0)) {
                    String temp = stringArray[j];
                    stringArray[j] = stringArray[j + 1];
                    stringArray[j + 1] = temp;
                }
            }
        }
        if (sortType.ASC == type) {
            return stringArray;
        } else if (sortType.DESC == type) {
            String[] newArr = new String[count];
            int j = 0;
            for (int i = count - 1; i > 0; i--) {
                newArr[j++] = stringArray[i];
            }
            stringArray = newArr;
            return stringArray;
        }
        return stringArray;
    }

    public boolean contains(String item) {
        for (int i = 0; i < count; i++)
            if (stringArray[i].equals(item))
                return true;
            return false;
    }

    public void swap(int index1, int index2) {
        String temp = stringArray[index1];
        stringArray[index1] = stringArray[index2];
        stringArray[index2] = temp;
    }

    public void removeAll(String[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < count; i++) {
                if (stringArray[i].equals(array[j])){
                    remove(i);
                    break;
                }
            }
        }

  }
  public void print(){
      for(int i = 0;i<count;i++){
          System.out.print(i + " -> "+stringArray[i]+" |");
      }
  }
   // public void Clear()
   // {
   //     stringArray = new String[0];
   // }
}
