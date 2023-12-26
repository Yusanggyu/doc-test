fruits = {
    "사과": {"price": 1500, "remain": 50},
    "바나나": {"price": 2000, "remain": 30},
    "딸기": {"price": 3500, "remain": 20},
    "오렌지": {"price": 2200, "remain": 40}
}

money = 0

for _ in range(int(input())):
    fruit, amount = input().split()
    amount = int(amount)
    amount = min(amount, fruits[fruit]["remain"])
    money += fruits[fruit]["price"] * amount
    fruits[fruit]["remain"] -= amount

print(money)
for key, value in fruits.items():
    print(key, value["remain"])