def has_number(password: str) -> bool:
    for character in password:
        if character.isdigit():
            return True
    return False


def has_upper(password: str) -> bool:
    for character in password:
        if character.isupper():
            return True
    return False


def has_lower(password: str) -> bool:
    for character in password:
        if character.islower():
            return True
    return False


def hasnt_especial_character(password: str) -> bool:
    for character in password:
        if not character.isalnum():
            return False
    return True


def has_minimum_size(password: str) -> bool:
    return 5 < len(password) < 33


def is_password_valid(password: str) -> bool:
    return has_number(password) and has_upper(password) and \
           has_lower(password) and hasnt_especial_character(password) and \
           has_minimum_size(password)


while True:
    try:
        password = input()
        if is_password_valid(password):
            print('Senha valida.')
        else:
            print('Senha invalida.')
    except EOFError:
        break
