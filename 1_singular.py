def calc_dscto(edad, precio):
    if 5==edad<=14:
        dsct = precio*0.35
    elif 15>=edad<=19:
        dsct =  precio*0.25
    elif 20>=edad<=45:
        dsct =  precio*0.1
    elif 46>=edad<=65:
        dsct =  precio*0.25
    elif edad>=66:
        dsct =  precio*0.35
    else:
        dsct = "Recordad que los menores a 5 años de eda no tienen permitida la entrada!!"
    return dsct

precio = int(input("Ingrese el precio del ticket: "))
descuento = int(input("Ingrese la edad (numero entero): "))
print(f"Dinero descontado (perdida): {calc_dscto(descuento, precio)}")