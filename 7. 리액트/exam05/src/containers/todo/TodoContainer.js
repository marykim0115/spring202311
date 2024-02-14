import React from 'react';
import styled from 'styled-components';
import TodoForm from '../../components/TodoForm';
import TodoList from '../../components/TodoList';

const ContentBox = styled.div`
  box-sizing: border-box;
  width: 100%;
  max-width: 720px;
  margin: 0 auto;
  background: #f8f8f8;
  padding: 25px;

  /* div 하위의 모든 요소에 부여하는 style */
  * {
    box-sizing: border-box;
  }
`;

const todos = [
    {id:1, title:"할일1"},
    {id:2, title:"할일2"},
];

const TodoContainer = () => {
  return (
    <>
      <ContentBox>
        <TodoForm />
        <TodoList todos={todos} />
      </ContentBox>
    </>
  );
};

export default React.memo(TodoContainer);
