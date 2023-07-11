#include<iostream>
#include<fstream>
#include<cstring>
#include<limits.h>
using namespace std;

int deliverSugar(int N) {
    if (N == 0) {
        return 0;  // 기저 조건: 남은 설탕이 없는 경우
    }
    if (N < 0) {
        return -1;  // 기저 조건: 정확하게 N킬로그램을 배달할 수 없는 경우
    }

    int count = INT_MAX;

    // 5킬로그램 봉지 사용
    int fiveKgCount = deliverSugar(N - 5);
    if (fiveKgCount != -1) {
        count = std::min(count, fiveKgCount + 1);
    }

    // 3킬로그램 봉지 사용
    int threeKgCount = deliverSugar(N - 3);
    if (threeKgCount != -1) {
        count = std::min(count, threeKgCount + 1);
    }

    return (count == INT_MAX) ? -1 : count;
}

int main() {
    int N;
    cout << "설탕 무게를 입력하세요: ";
    cin >> N;

    int count = deliverSugar(N);

    if (count == -1) {
        cout << -1 << endl;  // 정확하게 N킬로그램을 배달할 수 없는 경우 -1 출력
    }
    else {
        cout << count << endl;
    }

    return 0;
}
