import numpy as np
import matplotlib.pyplot as plt

# 과세표준, 세율, 누진공제액
tax_brackets = [12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000]
tax_rates = [0.06, 0.15, 0.24, 0.35, 0.38, 0.40, 0.42, 0.45]
deductions = [0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000]

# 정의역 (자연수가 아닌 양의 실수 전체)
x_values = np.linspace(0, 2000000000, 400)

# 함수 정의
def f(x):
    for i in range(len(tax_brackets) - 1):
        if tax_brackets[i] <= x < tax_brackets[i + 1]:
            return x * tax_rates[i]
    return x * tax_rates[-1]

def g(x):
    for i in range(len(tax_brackets) - 1):
        if tax_brackets[i] <= x < tax_brackets[i + 1]:
            return x * tax_rates[i] - deductions[i]
    return x * tax_rates[-1] - deductions[-1]

# 그래프 그리기
plt.figure(figsize=(10, 6))

# 파란색 그래프 (f(x) = x * 세율)
plt.plot(x_values, [f(x) for x in x_values], color='blue', label='f(x) = x * 세율', linewidth=2)

# 빨간색 그래프 (g(x) = x * 세율 - 누진공제액)
plt.plot(x_values, [g(x) for x in x_values], color='red', label='g(x) = x * 세율 - 누진공제액', linewidth=2)

# 그래프 타이틀과 레이블 설정
plt.title('과세표준에 따른 세금 및 누진공제액 그래프')
plt.xlabel('종합소득 (원)')
plt.ylabel('세금 (원)')

# 범례 추가
plt.legend()

# 그래프 표시
plt.grid(True)
plt.show()
