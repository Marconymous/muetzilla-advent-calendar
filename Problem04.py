points_chars = ['*', '/']
dash_chars = ['-', '+']
splitChars = points_chars + dash_chars
allowed_chars = list(range(0, 9)) + splitChars


def main():
    allowed_chars_out = "".join(map(str, allowed_chars))
    calculation = input(f"Enter a calculation which can contain following characters ({allowed_chars_out}) > ")

    split = split_calculation(calculation)
    try:
        after_point = point_calc(split)
        after_dash = dash_calc(after_point)
        print(f"The result is: {after_dash}")

    except:
        print("The calculation you entered is not Valid!")




def point_calc(calc):
    out = []
    for i, item in enumerate(calc):
        if item in points_chars:
            a = int(out.pop())
            b = int(calc.pop(i + 1))
            c = 0
            if item == '*':
                c = a * b
            else:
                c = a / b
            
            out.append(c)
            continue

        out.append(item)

    return out

def dash_calc(calc):
    out = []
    for i, item in enumerate(calc):
        if item in dash_chars:
            a = int(out.pop())
            b = int(calc.pop(i + 1))
            c = 0
            if item == '+':
                c = a + b
            else:
                c = a - b
            
            out.append(c)
            continue

        out.append(item)

    return out


def split_calculation(calc):
    split = []
    current = ''

    for c in calc:
        if c in splitChars:
            split.append(current)
            split.append(c)
            current = ''
            continue

        if c == ' ':
            continue

        current += c
    split.append(current)

    return split

if __name__ == "__main__":
    main()