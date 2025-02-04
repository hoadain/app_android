# app_android

## Hướng dẫn thêm Video và Âm thanh vào ứng dụng Android

### 1 Thêm file video & âm thanh vào dự án
- Tạo thư mục `res/raw/` nếu chưa có.
- Copy file `video.mp4` và `sound.mp3` vào `res/raw/`.

### 2 Thêm Video vào giao diện
- Thêm `VideoView` vào `activity_info.xml`.
- Trong `InfoActivity.java`, sử dụng `VideoView` để phát video từ `res/raw/video.mp4`.

### 3 Thêm nút phát Âm Thanh
- Thêm `Button` vào `activity_info.xml`.
- Trong `InfoActivity.java`, dùng `MediaPlayer` để phát `sound.mp3` khi nhấn nút.

### 4 Hướng dẫn làm phần này em hỏi chat
1. **Chuẩn bị file media** (`.mp4` và `.mp3`) và thêm vào `res/raw/`.
2. **Thiết kế giao diện** với `VideoView` và `Button`.
3. **Viết code Java** để phát video & âm thanh khi nhấn nút.
4. **Chạy ứng dụng** và kiểm tra xem video & âm thanh


### kết quả
![anh1](https://github.com/user-attachments/assets/4b245d5c-f271-4ad4-b71b-26b0252675b1)
![anh2](https://github.com/user-attachments/assets/433b1343-f151-4e1d-95a6-ec15e9e85a09)
