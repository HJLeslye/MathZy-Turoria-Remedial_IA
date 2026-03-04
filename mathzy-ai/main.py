import random
from fastapi import FastAPI

app = FastAPI()

@app.get("/generar/operacion")
def generar_ejercicio(tipo: str = "suma"):
    # Números pequeños para facilitar el aprendizaje
    n1 = random.randint(1, 20)
    n2 = random.randint(1, 20)
    resultado = n1 + n2
    
    # Explicación fácil para niños
    explicacion = (
        f"¡Hola! Para sumar {n1} y {n2}, sigue estos pasos: "
        f"Primero, colocamos los números uno debajo del otro, alineando las unidades en la misma columna. "
        f"Luego, sumamos cada columna por separado, comenzando por las unidades de la derecha. "
        f"Finalmente, escribimos el resultado {resultado} debajo de la línea."
    )
    
    # Formato LaTeX para visualización vertical
    latex_pasos = f"\\begin{{array}}{{r}} {n1} \\\\ + {n2} \\\\ \\hline {resultado} \\end{{array}}"

    return {
        "tipo": tipo,
        "enunciado": f"{n1} + {n2}",
        "resultado": resultado,
        "latex": explicacion + " " + latex_pasos
    }