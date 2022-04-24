# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)


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
