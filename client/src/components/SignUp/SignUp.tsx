import styles from "./SignUp.module.scss";
import { useNavigate } from "react-router-dom";

interface Iprops {
  email: string;
  name?: string;
}

interface IuserInfo {
  email: string;
  name: string;
  sex: string;
  birth: string;
  height: number;
  weight: number;
}

const SignUp = () => {
  const navigate = useNavigate();

  const clickHandlePrev = () => {
    navigate(-1);
  };
  const clickHandleSignUp = () => {
    navigate("/");
  };

  return (
    <div className={styles.backdrop}>
      <form className={styles.layout}>
        <div className={styles.title}>회원가입</div>
        <div className={styles.inputData}>
          <div className={styles.email}>
            <span>이메일</span>
            <input type="text" placeholder="dailydrug@gmail.com" />
          </div>
          <div className={styles.name}>
            <span>이름</span>
            <input type="text" placeholder="김디디" />
          </div>

          <div className={styles.optionalInfo}>
            <div className={styles.sex}>
              <span>성별</span>
              <select name="sex" id="">
                <option value="male">남</option>
                <option value="female">여</option>
              </select>
            </div>
            <div className={styles.birth}>
              <span>생년월일</span>
              <input type="date" />
            </div>
            <div className={styles.height}>
              <span>키</span>
              <input type="number" min={0} />
            </div>

            <div className={styles.weight}>
              <span>몸무게</span>
              <input type="number" min={0} />
            </div>
          </div>
        </div>

        <div className={styles.buttons}>
          <div onClick={clickHandleSignUp} className={styles.submit}>
            가입하기
          </div>
          <div onClick={clickHandlePrev} className={styles.prev}>
            이전으로
          </div>
        </div>
      </form>
    </div>
  );
};

export default SignUp;
