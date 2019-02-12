#include <stdio.h>

int main(void) {
  int Count, EvenCounter;
  printf("Enter the number upto which even numbers are to be printed:");
  scanf("%d", &Count);
  printf("The even numbers upto %d are", Count);
  for(EvenCounter = 0; EvenCounter <= Count; EvenCounter ++) {
    if(EvenCounter % 2 == 0) {
      printf(" %d", EvenCounter);
    }
  }
  printf(".");
  printf("\n");
  return 0;
}