package ejercicioexcepciones;

public class EjercicioExcepciones {
    public String Nombre;
     public String Apellido;
     public int Edad;
     

    public void Vendedor(String Nombre, String Apellido, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        
    }
    
    public void VerificarEdad(int Edad){
        if(this.Edad>=18){
            System.out.println("Usted puede desempeñar labores de vendedor");
        }
        else{
            
            
        }
    }
}
            
        