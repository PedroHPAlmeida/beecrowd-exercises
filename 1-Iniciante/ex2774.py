import math


def sensor_accuracy(tests: list) -> float:
    tests_avg = sum(tests) / len(tests)
    accuracy = 0
    for test in tests:
        accuracy += math.pow(test - tests_avg, 2)
    return math.sqrt(accuracy / (len(tests) - 1)) 


while True:
    try:
        input()
        test_cases = list(map(lambda x: float(x), input().split()))
        accuracy = sensor_accuracy(test_cases)
        print('{:.5f}'.format(accuracy))
    except EOFError:
        break
