# BottomNavigationLayout

© 2020 Dark Tornado, All rights reserved.

## 정보 / Info.
안드로이드 디자인 라이브러리 없이 구현된 BottomNavigationLayout.<br>
디자인 라이브러리가 용량을 많이 먹는 관계로(?) 비스무리한거 하나 만들었습니다.<br>
BottomNavigationLayout는 FrameLayout 기반으로 만들어졌습니다.<br>
BottomNavigationLayout made without Android Design Library.<br>
BottomNavigationLayout is based on FrameLayout.

## 라이선스 / License
[MIT License](https://github.com/DarkTornado/BottomNavigationLayout/blob/master/LICENSE)

## API
```java
- BottomNavigationLayout(Context context)
- BottomNavigationLayout(Context context, AttributeSet attrs)

- void setBottomBackgroundColor(int color);
- void setBackgroundDrawable(Drawable drawable);
- void setBackground(Drawable drawable);
- void addBottomButton(String text, int icon, Drawable drawable, View.OnClickListener listener);
- void addBottomButton(String text, int icon, Drawable drawable, View.OnClickListener listener, float textSize, int textColor);
- void replace(View view);
- void addView(View view);
```

## 예제 / Example
[Activity Example](https://github.com/DarkTornado/BottomNavigationLayout/blob/master/Example.java)


## 스크린샷 / Screenshot
<img src="https://raw.githubusercontent.com/DarkTornado/BottomNavigationLayout/master/Screenshot_1.png"><br><br>
<img src="https://raw.githubusercontent.com/DarkTornado/BottomNavigationLayout/master/Screenshot_2.png"><br><br>

