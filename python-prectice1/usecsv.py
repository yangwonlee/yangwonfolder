import csv

def openscv(filename):
    f = open(filename, 'r', encoding='utf-8')
    reader = csv.reader(f)
    output = []
    for i in reader:
        output.append(i)
    return output

def wrotecsv(filename, the_list):
    with open(filename, 'w', newline= '', encoding='utf-8') as f:
        csv_object = csv.writer(f, delimiter=',')
        csv_object.writerow(the_list)

def switch(list_name):
    for j in list_name:
        try:
            j[j.index(i)] = float(i.replace(',', ''))
        except:
            pass
    return list_name