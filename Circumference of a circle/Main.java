#include <stdio.h>

int main()
{
    float radius, diameter, circumference, area;
    
    
    
    scanf("%f", &radius);

    
    diameter = 2 * radius;
    circumference = 2 * 3.14 * radius;
    area = 3.14 * (radius * radius);

    
    
    printf("%.2f", circumference);
  

    return 0;
}