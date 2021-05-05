# miaosha
1. 这一版只是电商秒杀业务的基本实现，包括了用户otp注册、登陆、查看、商品列表、进入商品详情以及倒计时秒杀开始后下单购买的基本流程。但目前只针对单商品、单业务、单活动，
支持高并发和性能优化在下一阶段进行。
2. 该项目是前后端分离的（miaosha文件夹是后端代码，html文件夹是前端代码），前端使用的是HTML、CSS、JQuery以及Metronic框架，后端使用的是Springboot+MyBatis框架，数据库是MySQL(8.0.22)。
3. miaosha\src\main\resources\application.properties里的spring.datasource.password字段的值需要改成对应连接数据库的密码。
