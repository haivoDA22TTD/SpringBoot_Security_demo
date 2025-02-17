# SpringBoot_Security_demo
Đây bản thử nghiệm của dự án SpringBoot_Security thử nghiệm 
1. Authentication (xác thực)
Trước hết, nếu bạn đang chạy một ứng dụng (web) điển hình, bạn cần user của mình authenticate. Điều đó có nghĩa là ứng dụng của bạn cần xác minh xem user có phải là người mà anh ta thừa nhận đúng là anh ta hay không, thường được thực hiện bằng kiểm tra username và password.

User : “Tôi là user. username của tôi là: customer”

Ứng dụng web của bạn : "password của bạn là gì ?"

User : “Pass của tôi là: th3don4ld”.

Ứng dụng web của bạn : “Đăng nhập thành công. Chào mừng bạn!”

2. Authorization (Phân quyền)
Trong các ứng dụng đơn giản hơn, chỉ cần authenticate là đủ: Ngay sau khi người dùng authenticate, họ có thể truy cập từng phần của ứng dụng.

Nhưng hầu hết các ứng dụng đều có khái niệm về quyền (hoặc vai trò). Hãy tưởng tượng: khách hàng có quyền truy cập vào giao diện công khai của webshop của bạn và quản trị viên có quyền truy cập vào khu vực quản trị riêng biệt.

Cả hai loại user đều cần đăng nhập, nhưng thực tế authentication đơn thuần không nói lên gì về việc họ được phép làm gì trong hệ thống của bạn. Do đó, bạn cũng cần phải kiểm tra các quyền của user đã được authenticate, tức là  cần cấp quyền cho người dùng đó.

User : “Hãy để tôi chơi với quả bóng hạt nhân đó….”

Ứng dụng web của bạn : "Đợi một giây, tôi cần kiểm tra lại permission của bạn trước… , bạn có đủ điều kiện. Hãy cứ tận hưởng”


