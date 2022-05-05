# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)
- [Araştırma Projesi 3 - Font family XML](#3)
- [Araştırma Projesi 4 - Property Animation](#4)


## <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?

## <a name="1"></a> Cevap 1

val: Sabit değer tanımlamak için kullanılır. Tanımlandıktan sonra tekrar değiştirilemez. Javadaki final’a denk gelir. 
var: Normal değişken tanımlamak için kullanılır. Tanımladıktan sonra dilediğinizde değerini değiştirebilirsiniz.
Bazen bir değişken oluşturulurken değer atamak istemeyebiliriz. Bu durumda lateinit kullanılır. Lateinitle tanımlama yaparken ? ya da !! kullanmak zorunda kalmayız ancak değişken null olduğunda çökme meydana gelebilir. lateinit ise sadece var olan değişkenlerde kullanılır.

    class LoginFragment : Fragment() {

    private lateinit var usernameEditText: EditText	// değer atanmadı
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var statusTextView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        usernameEditText = view.findViewById(R.id.username_edit_text)	// değer ataması gerçekleşti
        passwordEditText = view.findViewById(R.id.password_edit_text)
        loginButton = view.findViewById(R.id.login_button)
        statusTextView = view.findViewById(R.id.status_text_view)
    }

    ...
    }

## <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 

## <a name="1"></a> Cevap 2

Android Studio, araçlar ad alanında tasarım zamanı özelliklerini (bir parçada hangi düzenin gösterileceği gibi) veya derleme zamanı davranışlarını (XML kaynaklarınıza hangi küçültme modunun uygulanacağı gibi) etkinleştiren çeşitli XML özniteliklerini destekler. Uygulamanızı oluşturduğunuzda, derleme araçları bu öznitelikleri kaldırır, böylece APK boyutunuz veya çalışma zamanı davranışınız üzerinde hiçbir etkisi olmaz.
    
RootTag yerine istediğimiz Layout'u kullanabiliriz
    
     
    <RootTag xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools" >
    
    
## <a name="3"></a> Araştırma Projesi 3

- Font family dosyası nasıl oluşturulup kullanıyoruz?
- Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?

## <a name="1"></a> Cevap 3

İlk olarak res-> New-> Android Resource File
File Name : examplefont
Resource type : Font şeklinde font xml'imizi oluşturuyoruz. 

Dışarıdan @font/examplefont ya da R.font.examplefont şeklinde erişim sağlayabilmekteyiz.

xml içini

    <?xml version="1.0" encoding="utf-8"?>
    <font-family xmlns:android="http://schemas.android.com/apk/res/android">
        <font
            android:fontStyle="normal"
            android:fontWeight="400"
            android:font="@font/baloo_bhaina" />
        <font
            android:fontStyle="italic"
            android:fontWeight="400"
            android:font="@font/baloo_bhaina" />
    </font-family>

şeklinde kodluyoruz.

TextView içini

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="@font/examplefont"
        android:text="Hello World!"
        android:textSize="34sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

şeklinde kodluyoruz.

<p align="center"  width="70%">
  <img width="20%" src="https://user-images.githubusercontent.com/58865367/166959758-a047b936-24fe-42a4-bc31-0bddce1fcc89.png" alt="Sublime's custom image"/>
</p>

İstediğimiz gibi özel bir yazı tipi ayarlamak istediğimizde, tüm uygulamanın ve tüm bileşenlerin varsayılan yerine özel yazı tipinin kullanması gerektiğinde hepsini ortak bir xml'de toplayabilmek için bu yöntemi tercih edebiliyoruz.

## <a name="4"></a> Araştırma Projesi 4

- Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı kısaca açıklayınız

## <a name="1"></a> Cevap 4


