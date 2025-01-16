def nombre = "Fernando" // defino una variable pero no tenemos especificado el tipo // cadena o string
def edad = 27 //
int edad = 27 // 

def array = [1,2,3,4,5]

def mapa = [nombre: "Pedro", edad: 29]

def funcionQueRetornaNombre(nombre) {
    return "Hola, $nombre"
}

println funcionQueRetornaNombre("Raul")