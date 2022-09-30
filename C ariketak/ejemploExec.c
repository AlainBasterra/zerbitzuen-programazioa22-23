#include <unistd.h>
#include <stdio.h>
void main(){
// Programación de servicios y procesos
printf("Ejemplo de uso de exec():");
printf("Los archivos en el directorio son:\n");
execl("/bin/ls", "ls", "-l", (char *)NULL);
printf("¡¡¡ Esto no se ejecuta !!!\n");
}