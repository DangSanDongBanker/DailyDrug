import "./Header.module.scss";

const Header = () => {
  return (
    <div className="Layout">
      <div>DailyDrug</div>
      <nav>
        <div>카테고리</div>
        <div>비교하기</div>
      </nav>
      <div>로그인</div>
    </div>
  );
};

export default Header;
