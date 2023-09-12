while True:
    try:
        hh, mm = str(input()).split()
        hh = int(hh) // 30
        mm = int(mm) // 6

        print('{:02}:{:02}'.format(hh, mm))
            
    except EOFError:
        break
